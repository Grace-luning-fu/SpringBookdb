package me.grace.bookdatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    public class MainController {

        @RequestMapping("/")
        public @ResponseBody
        String defaultRequest() {
            return "Welcome to the book database!";
        }

        @RequestMapping("/findbooks")
        public @ResponseBody
        String category() {
            return "Select Category";
        }

        @RequestMapping("/findbooksbyauthor")
        public @ResponseBody
        String author() {
            return "Select Author";
        }

        @RequestMapping("/findbookbysku")
        public @ResponseBody
        String sku() {
            return "Select SKU";
        }

        @RequestMapping("/addbook")
        public @ResponseBody
        String addBook() {
            return "This is where to add books";
        }

        @RequestMapping("/deletebook")
        public @ResponseBody
        String deleteBook() {
            return "This is where to add books";
        }

        @RequestMapping("/showallbooks")
        public @ResponseBody
        String showall() {
            return "This is a list of all books";
        }

        }
