package com.boda.xy;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
