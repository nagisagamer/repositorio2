/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcej1.tiendaServicios;

import java.util.List;
import jdbcej1.PersistenciaTienda.fabricanteDAOext;
import jdbcej1.entidadesTienda.fabricante;

/**
 *
 * @author Usuario
 */
public class servicioFabricante {
    private fabricanteDAOext fabricanteDao;

    public servicioFabricante() {
        fabricanteDao = new fabricanteDAOext();
    }

    public List<fabricante> listarFabricantes() {
        return fabricanteDao.listarFabricantes();
    }

    public fabricante obtenerFabricantePorCodigo(int codigo) {
        return fabricanteDao.obtenerFabricantePorCodigo(codigo);
    }

    public void ingresarFabricante(fabricante fabricante) {
        fabricanteDao.ingresarFabricante(fabricante);
    }

    public void editarFabricante(fabricante fabricante) {
        fabricanteDao.editarFabricante(fabricante);
    }

    public void eliminarFabricante(int codigo) {
        fabricanteDao.eliminarFabricante(codigo);
    }
}

