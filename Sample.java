import java.util.*;
import java.lang.System;
import java.io.*;
import reactor.core.publisher.Mono;
// criar um mono para pegar e para imprimir precisa se inscrever no fluxo 
public class Sample{
    public static void main(String[] args) {
        Mono.just(1) // recebe 1 ou 0 dado
        .doOnSuccess(System.out::println) //declarou o fluxo
        .subscribe(); // se inscreveu no fluxo para poder imprimir
 
   
    }
}