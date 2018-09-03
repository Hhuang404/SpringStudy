package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.hh.controller","com.hh.service","com.hh.dao"})
public class MainConfigOfAutowired {

}
