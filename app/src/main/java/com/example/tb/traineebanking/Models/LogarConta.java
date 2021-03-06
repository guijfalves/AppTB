package com.example.tb.traineebanking.Models;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.text.SimpleDateFormat;


@JsonRootName("LogarConta")
public class LogarConta implements Serializable {

    @SerializedName("Agencia")
    public int agencia;

    @SerializedName("Conta")
    public int conta;

    @SerializedName("Senha")
    public String senha;

}
