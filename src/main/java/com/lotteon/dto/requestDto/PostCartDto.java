package com.lotteon.dto.requestDto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostCartDto {

    private Long prodId;
    private int quantity;
}
