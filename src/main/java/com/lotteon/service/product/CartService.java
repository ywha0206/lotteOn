package com.lotteon.service.product;

import com.lotteon.dto.requestDto.PostCartDto;
import com.lotteon.repository.product.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CartService {

    private final CartRepository cartRepository;

    public CartResponseDto selectCarts(long uid) {


        return null;
    }

    public void selectCart(){}
    public void insertCart(PostCartDto cartDto) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth.getName();

    }
    public void updateCart() {}
    public void deleteCart() {}

}
