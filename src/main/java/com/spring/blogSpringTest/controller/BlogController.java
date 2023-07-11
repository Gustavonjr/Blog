package com.spring.blogSpringTest.controller;

import com.spring.blogSpringTest.model.Post;
import com.spring.blogSpringTest.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/posts",method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogService.findAll();
        mv.addObject("posts",posts);
        return mv;

    }

}