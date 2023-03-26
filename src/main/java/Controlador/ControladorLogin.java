/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entities.Person;
import Facade.PersonFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jonathan
 */
@Named(value = "controladorLogin")
@SessionScoped
public class ControladorLogin implements Serializable {


 Person per = new Person();
    @EJB
    private PersonFacadeLocal personFacade;

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public PersonFacadeLocal getPersonFacade() {
        return personFacade;
    }

    public void setPersonFacade(PersonFacadeLocal personFacade) {
        this.personFacade = personFacade;
    }

    public ControladorLogin() {
    }

    

    public String login() {
        String ruta = "";
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            this.per = this.personFacade.loginUser(per.getFirstName(), per.getLastName());
            if (per == null) {
                FacesMessage fm = new FacesMessage("Usuario y/o contraseña incorrectos", "ERROR MSG");
                fm.setSeverity(FacesMessage.SEVERITY_ERROR);
                context.addMessage(null, fm);
                per = new Person();
                ruta = "login";
            } else {
                context.getExternalContext().getSessionMap().put("usuario", per.getFirstName());
                per = new Person();
                ruta = "index";
            }

        } catch (Exception e) {
        }

        return ruta;
    }
}