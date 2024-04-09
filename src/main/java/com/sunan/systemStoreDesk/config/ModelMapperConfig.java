package com.sunan.systemStoreDesk.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sunan.systemStoreDesk.data.CategoryVO;
import com.sunan.systemStoreDesk.data.ClientVO;
import com.sunan.systemStoreDesk.data.OrderVO;
import com.sunan.systemStoreDesk.data.PaymentVO;
import com.sunan.systemStoreDesk.data.ProductVO;
import com.sunan.systemStoreDesk.models.Category;
import com.sunan.systemStoreDesk.models.Client;
import com.sunan.systemStoreDesk.models.Order;
import com.sunan.systemStoreDesk.models.Payment;
import com.sunan.systemStoreDesk.models.Product;

@Configuration
public class ModelMapperConfig {
    
    @Bean
    public ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();

        modelMapper.createTypeMap(Category.class, CategoryVO.class)
            .<Long>addMapping(src -> src.getId(), (dest, value) -> dest.setId(value));
        
        modelMapper.createTypeMap(Product.class, ProductVO.class)
            .<Long>addMapping(src -> src.getId(), (dest, value) -> dest.setId(value));

        modelMapper.createTypeMap(Client.class, ClientVO.class)
            .<Long>addMapping(src -> src.getId(), (dest, value) -> dest.setId(value));

        modelMapper.createTypeMap(Payment.class, PaymentVO.class)
            .<Long>addMapping(src -> src.getId(), (dest, value) -> dest.setId(value));

        modelMapper.createTypeMap(Order.class, OrderVO.class)
            .<Long>addMapping(src -> src.getId(), (dest, value) -> dest.setId(value));
            
        return modelMapper;
    }
}
