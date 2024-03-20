/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves.go@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exAula11;

/**
 *
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 */
public class Veiculo {

    private String placa;
    private int ano;
    
    public Veiculo() {
        this.placa = "";
        this.ano = 0;
    }
    
    public Veiculo (String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public void setAno (String ano) {
        this.ano = Integer.parseInt(ano);
    }
    
    public String getPlaca () {
        return placa;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void exibirDados () {
        System.out.println("Placa: " + placa);
        System.out.println("Ano; " + ano);
    }
    
    }

