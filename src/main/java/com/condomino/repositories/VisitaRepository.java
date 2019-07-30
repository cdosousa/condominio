/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.condomino.repositories;

import com.condomino.dao.AcessoBancoDAO;
import com.condomino.domain.Visita;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Cristiano de Oliveira Sousa
 * @Local OICI Serviços e Desenvolvimento Ltda-EPP
 * @data 24/07/2019
 */
@Stateless
public class VisitaRepository extends AcessoBancoDAO<Visita, Serializable> implements Serializable {

    public static final long serialVersionUID = 1L;

    @Inject
    public VisitaRepository() {
    }
}