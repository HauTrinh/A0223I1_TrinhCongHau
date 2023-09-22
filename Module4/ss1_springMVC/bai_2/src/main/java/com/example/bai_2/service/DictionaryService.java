package com.example.bai_2.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryService {
static Map<String, String> list = new HashMap<>();
static {
    list.put("cat", "mèo");
    list.put("hello", "xin chào");
    list.put("camp", "cắm trại");
}
public String search(String search){
    return list.get(search);
}
}
