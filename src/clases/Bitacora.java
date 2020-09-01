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
