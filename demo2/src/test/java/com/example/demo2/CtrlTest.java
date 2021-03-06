package com.example.demo2;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.net.URLEncoder;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringRunner.class)

@SpringBootTest

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CtrlTest {
	
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }
    /*
    @Test
    public void test0() throws Exception {
    	for(int i=0;i<1;i++) {
	        mockMvc.perform(get("/search/auto").param("keyword", "삼성전자"))
	               .andDo(print())
	               .andExpect(status().isOk());
	        mockMvc.perform(get("/search/auto?keyword=삼성전자"))
            .andDo(print())
            .andExpect(status().isOk());
    	}
    }
    
    @Test
    public void test1() throws Exception {
    	mockMvc.perform(get("/search/auto?keyword=삼성전자"))
    	.andDo(print())
    	.andExpect(status().isOk());
    }
  	*/
    /*
    @Test
    public void test2() throws Exception {
    	mockMvc.perform(get("/search/auto/category?keyword=java"))
    	.andDo(print())
    	.andExpect(status().isOk());
    }*/
    
    @Test
    public void test3() throws Exception {
    	mockMvc.perform(get("/job/result")
    			.param("keywords", "java")
    			.param("category", "4")
    			.param("start", "0")
    			.param("count","10")
    			.param("career", "신입")
    			)
        .andDo(print())
        .andExpect(status().isOk());
    }
    /*
    @Test
    public void test4() throws Exception {
    	String keyword=URLEncoder.encode("삼성전자","UTF-8");
    	mockMvc.perform(get("/company/"+keyword))
        .andDo(print())
        .andExpect(status().isOk());
    }*/
    /*
    @Test
    public void test5() throws Exception {
    	String keyword=URLEncoder.encode("삼성전자","UTF-8");
    	mockMvc.perform(get("/company/"+keyword+"/info"))
    	.andDo(print())
    	.andExpect(status().isOk());
    }*/
}