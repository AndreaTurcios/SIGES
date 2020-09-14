/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Estrada
 */
public class Bitacora {
    private Connection cn;
    private Integer ID;
    
    public Bitacora() {
        //estableciendo la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    public boolean BitacoraCreateUsuario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbUsuarios','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateUsuario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbUsuarios','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraReadUsuario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Observo en tbUsuarios','Select', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateDuenio(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbDuenio','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateDuenio(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbDuenio','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteDuenio(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbDuenio','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraCreateMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbMascota','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbMascota','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbMascota','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateFicha(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbFicha','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateFicha(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbFicha','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteFicha(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbFicha','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTEm(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoEm','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTEm(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoEm','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteTem(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoEm','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbCita','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbCita','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbCita','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoCita','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoCita','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraReadTipoCita(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Observo en tbTipoCita','Read', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbConsulta','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbConsulta','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbConsulta','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoConsulta','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoConsulta','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraReadTipoConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Observo en tbTipoConsulta','Read', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraDeleteTipoConsulta(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoConsulta','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoCliente(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoCliente','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoCliente(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoCliente','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteTipoCliente(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoCliente','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoPago(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoTipoPago','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoPago(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoPago','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraReadAgenda(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Observo en Agenda','Read', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraDeleteTipoPago(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoPago','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoMascota','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoMascota','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteTipoMascota(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoMascota','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateProductos(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbProductos','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateProductos(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbProductos','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraReadProductos(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Observo en tbProductos','Select', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoProductos(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoProductos','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoProductos(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoProductos','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateCodigoZona(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbCodigoZona','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateCodigoZona(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbCodigoZona','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteCodigoZona(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbCodigoZona','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreatePreguntas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbPreguntas','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdatePreguntas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbPreguntas','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeletePreguntas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbPreguntas','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateRespuestas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbRespuestas','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateRespuestas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbRespuestas','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteRespuestas(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbRespuestas','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateNacionalidad(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbNacionalidad','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateNacionalidad(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbNacionalidad','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteNacionalidad(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbNacionalidad','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateDetalleFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbDetalleFactura','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateDetalleFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbDetalleFactura','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteDetalleFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbDetalleFactura','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateTipoEstado(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbTipoEstado','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateTipoEstado(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbTipoEstado','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteTipoEstado(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbTipoEstado','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraCreateFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbFactura','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbFactura','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteFactura(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbFactura','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraCreateInventario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbInventario','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateInventario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbInventario','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteInventario(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbInventario','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraCreateProveedor(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Ingreso en tbProveedor','Create', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        public boolean BitacoraUpdateProveedor(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Modifico en tbProveedor','Update', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
        public boolean BitacoraDeleteProveedor(){
            boolean retorno = false;
            try{
                System.out.println(ID);
                String query = "declare @fecha datetime\n"
                        + "set @fecha = (select GETDATE());\n"
                        +"\n"
                        +"INSERT INTO bitacora (accion, instruccion, fecha, ID_usuario) VALUES ('Elimino en tbProveedor','Delete', @fecha, "+ID+");";
                PreparedStatement cmd = cn.prepareStatement(query);
                if (!cmd.execute()) {
                    retorno = true;
                }
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
            return retorno;

        }
        
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }
}
