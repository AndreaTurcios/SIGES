/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Estrada
 */
public class Pool {
    public DataSource dataSource;

    public String db = "SIGES";
    public String url = ("jdbc:sqlserver://DESKTOP-J7LU3FU\\SQLEXPRESS;" + "databaseName=SIGES;integratedSecurity=true;");



    public Pool(){

        inicializaDataSource();

    }

    private void inicializaDataSource(){


        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);


        dataSource = basicDataSource;

    }
}
