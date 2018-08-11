package controllers;

import entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repositories.OrderRepo;

@Controller
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping("/addOrder")
    public String addOrder(Model model) {
        model.addAttribute("order", new Order());
        return "orderAddFormView";
    }

    @PostMapping("/addOrder")
    public String addOrder(@ModelAttribute Order order) {
        orderRepo.save(order);
        return "redirect:/";
    }


}
