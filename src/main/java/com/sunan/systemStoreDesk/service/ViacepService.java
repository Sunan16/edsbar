package com.sunan.systemStoreDesk.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.sunan.systemStoreDesk.entities.Address;
import com.sunan.systemStoreDesk.entities.json.JsonAddressViacep;
import com.sunan.systemStoreDesk.gui.util.Alerts;

public class ViacepService {

	public Address getEndereco(String cep) {
		Address address = null;
		HttpGet request = new HttpGet("http://viacep.com.br/ws/" + cep + "/json/");
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpClient.execute(request)){
			HttpEntity entity = response.getEntity();
			if(entity != null) {
				String result = EntityUtils.toString(entity);
				Gson gson = new Gson();
				address = gson.fromJson(result, JsonAddressViacep.class).toAddressObj();
			}
		}catch(ClientProtocolException e) {
			Alerts.showAlert("Erro no Protocolo de Cliente", null, "Erro ao buscar informações", null);
		}catch(IOException e) {
			Alerts.showAlert("Erro de I/O", null, "Erro na Entrada e Saida", null);
		}
		return address;
	}
}
