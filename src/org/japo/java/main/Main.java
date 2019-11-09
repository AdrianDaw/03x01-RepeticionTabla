/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

public class Main {

    public static void main(String[] args) {

        // REFERENCIAS
        final int CUENTA_INI = 0;
        final int CUENTA_FIN = 11;
        final int tabla9 = 9;
        int resultado;

        // CABECERA
        System.out.println("Tabla del 9");
        System.out.println("===========");

        // BUCLE
        for (int i = CUENTA_INI; i < CUENTA_FIN; i++) {
            
            // OPERACION
            resultado = i * tabla9;

            // MENSAJE DE SALIDA
            System.out.printf("%d * %d = %d%n", i, tabla9, resultado);
        }
    }
}

