package com.huisam.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EventDto {

    @NotNull
    private String name;

    @NotNull
    private String password;

    @PositiveOrZero
    private int money;
}
