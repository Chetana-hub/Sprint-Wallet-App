package com.cg.paymentapp.beans;

import java.time.LocalDate;

public class BillPayment {

	private int billId;
	private Wallet wallet;
	private BillType billtype;
	private double amount;
	private LocalDate paymentDate;
}
