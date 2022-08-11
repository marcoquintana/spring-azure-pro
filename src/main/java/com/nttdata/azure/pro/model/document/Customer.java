package com.nttdata.azure.pro.model.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase Customer.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private long id;
  private String documentType;
  private String documentNumber;
  private String name;
  private String product;
  private String amount;

}

