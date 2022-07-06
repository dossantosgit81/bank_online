package com.estudosms.bancoonline.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Agency {
    CAIXA_ECONOMICA_FEDERAL(""),
    BRADESCO(""),
    BANCOBRASIL(""),
    ITAU("");

    public String agency;
}
