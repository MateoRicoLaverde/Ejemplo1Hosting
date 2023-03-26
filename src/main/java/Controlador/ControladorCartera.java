/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controlador;

import Entities.Cartera;
import Facade.CarteraFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import Entities.OrdenEntrada;
import Facade.OrdenEntradaFacade;

/**
 *
 * @author mateo
 */
@Named(value = "controladorCartera")
@SessionScoped
public class ControladorCartera implements Serializable {
    
    @EJB
    private CarteraFacade carteraFacade;
    @EJB
    private OrdenEntradaFacade ordenEntradaFacade;
    private Cartera cartera = new Cartera();
    private int ordenentradaSelect;

    public int getOrdenentradaSelect() {
        return ordenentradaSelect;
    }

    public void setOrdenentradaSelect(int ordenentradaSelect) {
        this.ordenentradaSelect = ordenentradaSelect;
    }

    public Cartera getCartera() {
        return cartera;
    }

    public void setCartera(Cartera cartera) {
        this.cartera = cartera;
    }
    /**
     * Creates a new instance of ControladorCartera
     */
    public ControladorCartera() {
    }
    
    public List<OrdenEntrada> getAllOrdenEntrada() {
        return ordenEntradaFacade.findAll();
        
    }
    public void save (){
        cartera.setNumOrdenCartera(ordenEntradaFacade.find(ordenentradaSelect));
        if (cartera.getCodCartera() != null) {
            carteraFacade.edit (cartera);
        } else {
            carteraFacade.create(cartera);
        }
        cartera = new Cartera();
    }

    public CarteraFacade getCarteraFacade() {
        return carteraFacade;
    }

    public void setCarteraFacade(CarteraFacade carteraFacade) {
        this.carteraFacade = carteraFacade;
    }

    public OrdenEntradaFacade getOrdenEntradaFacade() {
        return ordenEntradaFacade;
    }

    public void setOrdenEntradaFacade(OrdenEntradaFacade ordenEntradaFacade) {
        this.ordenEntradaFacade = ordenEntradaFacade;
    }
    
    public void selectUpddate (Cartera cartera){
        this.cartera = cartera;
    }
    public List<Cartera> getAll () {
        return carteraFacade.findAll();
    }
    public void delete(Cartera cartera){
        carteraFacade.remove(cartera);
    }
}
