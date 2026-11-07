package com.example.demo.reserva.entity;

public class ReporteVenta {
	    private String criterio;
	    private int entradasVendidas;
	    private double totalIngresos;

	    public ReporteVenta(String criterio, int entradasVendidas, double totalIngresos) {
	        this.criterio = criterio;
	        this.entradasVendidas = entradasVendidas;
	        this.totalIngresos = totalIngresos;
	    }

	    public String getCriterio() { return criterio; }
	    
	    public void setCriterio(String criterio) { this.criterio = criterio; }
	    
	    public int getEntradasVendidas() { return entradasVendidas; }
	    
	    public void setEntradasVendidas(int entradasVendidas) { this.entradasVendidas = entradasVendidas; }
	    
	    public double getTotalIngresos() { return totalIngresos; }
	    
	    public void setTotalIngresos(double totalIngresos) { this.totalIngresos = totalIngresos; }
	}


