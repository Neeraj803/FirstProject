package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
@GetMapping("/Book")
public List<Book> book(){
	
	return Arrays.asList(new Book(1,"Java ","Thomas"));
}
}
