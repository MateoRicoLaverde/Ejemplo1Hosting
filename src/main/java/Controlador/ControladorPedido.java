/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controlador;

import Entities.DetallePedido;
import Entities.EstadoPedido;
import Entities.Pedido;
import Entities.Usuario;
import Facade.EstadoPedidoFacade;
import Facade.PedidoFacade;
import Facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author begam
 */
@Named(value = "controladorPedido")
@SessionScoped
public class ControladorPedido implements Serializable {

    @EJB
    private PedidoFacade pedidoFacade;
    @EJB
    private EstadoPedidoFacade estadoPedidoFacade;
    @EJB
    private UsuarioFacade usuarioFacade;
    private Pedido pedido = new Pedido();
    private String estadopedidoSelect;
    private String clientesSelect;
    /**
     * Creates a new instance of ControladorPedido
     */
    public ControladorPedido() {
    }

    public List<EstadoPedido> getAllEstadopedido() {
        return estadoPedidoFacade.findAll();
    }

    public void save() {
        pedido.setCodEstPedido(estadoPedidoFacade.find(estadopedidoSelect));
        pedido.setNdocClient(usuarioFacade.find(clientesSelect));
        
        if (pedido.getNumPedido() != null) {
            pedidoFacade.edit(pedido);
        } else {
            pedidoFacade.create(pedido);
        }
        pedido = new Pedido();

    }

    public void selecUpdate(Pedido pedido) {
         this.pedido = pedido;
    }

    public List<Pedido> getAll() {
        return pedidoFacade.findAll();
    }
    public List<EstadoPedido> getAllestadoPedido() {
        return estadoPedidoFacade.findAll();
    }
    public List<Usuario> getAllusuario() {
        return usuarioFacade.findAll();
    }

    public void delete(Pedido pedido) {
        pedidoFacade.remove(pedido);
    }

    public PedidoFacade getPedidoFacade() {
        return pedidoFacade;
    }

    public void setPedidoFacade(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getestadopedidoSelect() {
        return estadopedidoSelect;
    }

    public void setestadopedidoSelect(String estadopedidoselect) {
        this.estadopedidoSelect = estadopedidoselect;

    }

    public EstadoPedidoFacade getEstadoPedidoFacade() {
        return estadoPedidoFacade;
    }

    public void setEstadoPedidoFacade(EstadoPedidoFacade estadoPedidoFacade) {
        this.estadoPedidoFacade = estadoPedidoFacade;
    }

    public String getEstadopedidoselect() {
        return estadopedidoSelect;
    }

    public void setEstadopedidoselect(String estadopedidoselect) {
        this.estadopedidoSelect = estadopedidoselect;
    }

    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public String getClientesSelect() {
        return clientesSelect;
    }

    public void setClientesSelect(String clientesSelect) {
        this.clientesSelect = clientesSelect;
    }
    

    
}
