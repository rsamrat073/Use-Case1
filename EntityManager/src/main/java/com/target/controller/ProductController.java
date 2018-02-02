/**
 * 
 */
package com.target.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.Entity;
import com.target.model.Product;

/**
 * @author sroy28
 *
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController extends EntityController<Product> {
	
}
