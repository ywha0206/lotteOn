package com.lotteon.controller.controller;

import com.lotteon.dto.requestDto.PostCartDto;
import com.lotteon.service.product.CartService;
import com.lotteon.service.product.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
@RequiredArgsConstructor
@Log4j2
public class CartOrderController {

    private final CartService cartService;
    private final OrderService orderService;

    @GetMapping("/cart")
    public String join(Model model, Authentication auth) {
//        String uid = auth.getName();
//        auth.getAuthorities();
//        auth.getPrincipal().toString();
//        log.info("uid" + uid);
        //CartResponseDto carts = cartService.selectCarts(uid);
        return "pages/product/cart";
    }

    @PostMapping("/cart")
    public void cart(PostCartDto postCartDto){

        cartService.insertCart(postCartDto);

    }

    @GetMapping("/cart/direct")
    public String cartDirect(Model model) {
        return "redirect:/prod/order";
    }

    @GetMapping("/order")
    public String order(Model model) {
        return "pages/product/order";
    }

    @GetMapping("/order/complete")
    public String orderComplete(Model model) {
        return "pages/product/complete";
    }
}
