package com.cibt.app.ecommercesite.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.cibt.app.ecommercesite.Entity.Product;
import com.cibt.app.ecommercesite.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    
    @Autowired
    private ProductRepository productrepository;

    @GetMapping()
    public String index(Model model){
        model.addAttribute("products", productrepository.findAll());
        return "/product/index";
    }

    @GetMapping(value = "/json")
    @ResponseBody
    public List<Product> json(){
        return productrepository.findAll();
    }


    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id")int id){
        productrepository.deleteById(id);
        return "redirect:/product?success";
    }

    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id")int id ,
     Model model){

       model.addAttribute("products", productrepository.findById(id).get());
        return "/product/edit";
    }

    @PostMapping()
    public String save(Product product){
        productrepository.save(product);
        return "redirect:/product?success";
    }

    @GetMapping(value = "/create")
    public String create(){
        return "/product/table";
    }

    @GetMapping(value = "/error")
    public String errorpage(){
        return "/product/error";
    }
}