package controler;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Classificando o IMC com base na faixa etária e sexo
        if (idade >= 2 && idade <= 12) {
            return classificarIMCInfantil(imc, sexo, idade);
        } else if (idade >= 20 && idade <= 65) {
            return classificarIMCAdulto(imc, sexo);
        } else if (idade > 65) {
            return classificarIMCIdosos(imc, sexo);
        } else {
            return "Este programa não é válido para menores de 2 anos.";
        }
    }

    // Classificação do IMC para crianças entre 2 e 12 anos
    public String classificarIMCInfantil(double imc, String sexo,int idade) {
        if (sexo.equalsIgnoreCase("MASCULINO")) { //menino
            if (idade == 2) {
                if (imc < 15.00) {
                    return "Baixo peso";
                } else if (imc >= 15.00 && imc < 18.00) {
                    return "Peso Normal";
                } else if (imc >= 18.00 && imc <= 19.00) {
                    return "Sobrepeso";
                } else if (imc > 19.00) {
                    return "Obesidade";
                }
            }
            if (idade == 4) {
                if (imc < 14.50) {
                    return "Baixo peso";
                } else if (imc >= 14.50 && imc < 17.00) {
                    return "Peso Normal";
                } else if (imc >= 17.00 && imc <= 18.00) {
                    return "Sobrepeso";
                } else if (imc > 18.00) {
                    return "Obesidade";
                }
            }
            if (idade == 6){
                if(imc < 14.00) {
                    return "Baixo peso";
                }else if (imc >= 14.00 && imc < 17.00) {
                    return "Peso Normal";
                }else if (imc >= 17.00 && imc <= 18.00) {
                    return "Sobrepeso";
                }else if (imc > 18.00) {
                    return "Obesidade";
                }
            }
            if (idade == 8){
                if(imc < 14.00) {
                    return "Baixo peso";
                }else if (imc >= 14.00 && imc < 17.50) {
                    return "Peso Normal";
                }else if (imc >= 17.50 && imc <= 19.50) {
                    return "Sobrepeso";
                }else if (imc > 19.50) {
                    return "Obesidade";
                }
            }
            if(idade == 10){
                if(imc < 14.50) {
                    return "Baixo peso";
                }else if (imc >= 14.50 && imc < 19.00) {
                    return "Peso Normal";
                }else if (imc >= 19.00 && imc <= 21.50) {
                    return "Sobrepeso";
                }else if (imc > 21.50) {
                    return "Obesidade";
                }
            }
            if(idade == 12){
                if(imc < 15.50) {
                    return "Baixo peso";
                }else if (imc >= 15.50 && imc < 20.50) {
                    return "Peso Normal";
                }else if (imc >= 20.50 && imc <= 23.50) {
                    return "Sobrepeso";
                }else if (imc > 23.50) {
                    return "Obesidade";
                }
            }
        } else if (sexo.equalsIgnoreCase("FEMININO")) { //menina
            if (idade == 2) {
                if (imc < 13.8) return "Baixo peso";
                else if (imc >= 13.8 && imc <= 16.8) return "Peso Normal";
                else if (imc > 16.8 && imc <= 19) return "Sobrepeso";
                else if(imc > 19) return "Obesidade";
            }
            if (idade == 4) {
                if (imc < 14.0) return "Baixo peso";
                else if (imc >= 14.0 && imc <= 17) return "Peso Normal";
                else if (imc > 17 && imc <= 19.3) return "Sobrepeso";
                else if (imc > 19.3) return "Obesidade";
            }
            if (idade == 6) {
                if (imc < 14.3) return "Baixo peso";
                else if (imc >= 14.3 && imc <= 18) return "Peso Normal";
                else if (imc > 18 && imc <= 20.8) return "Sobrepeso";
                else if (imc > 20.8) return "Obesidade";
            }
            if (idade == 8) {
                if (imc < 14.8) return "Baixo peso";
                else if (imc >= 14.8 && imc <= 19) return "Peso Normal";
                else if (imc > 19 && imc <= 21.5) return "Sobrepeso";
                else if(imc > 21.5) return "Obesidade";
            }
            if (idade == 10) {
                if (imc < 15.3) return "Baixo peso";
                else if (imc >= 15.3 && imc <= 20) return "Peso Normal";
                else if (imc > 20 && imc <= 22.8) return "Sobrepeso";
                else if(imc > 22.8) return "Obesidade";
            }
            if (idade == 12) {
                if (imc < 15.8) return "Baixo peso";
                else if (imc >= 15.8 && imc <= 21) return "Peso Normal";
                else if (imc > 21 && imc <= 24) return "Sobrepeso";
                else if (imc > 24) return "Obesidade";
            }
        } else {
            return "sexo inválido";
        }
        return " ";
    }

    // Classificação do IMC para adultos entre 20 e 65 anos
    public String classificarIMCAdulto(double imc, String sexo) {
        if (sexo.equalsIgnoreCase("MASCULINO")) {
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                return "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                return "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade grau I";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (sexo.equalsIgnoreCase("FEMININO")) {
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                return "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                return "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade grau I";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            return "Sexo inválido.";
        }
    }

    // Classificação do IMC para idosos acima de 65 anos
    public String classificarIMCIdosos(double imc, String sexo) {
        if (sexo.equalsIgnoreCase("MASCULINO")) {
            if (imc < 21.9) {
                return "Baixo peso";
            } else if (imc >= 21.9 && imc < 27) {
                return "Peso normal";
            } else if (imc >= 27.1 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30.1 && imc < 35) {
                return "Obesidade grau I";
            } else if (imc >= 35.1 && imc < 39.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (sexo.equalsIgnoreCase("FEMININO")) {
            if (imc < 21.9) {
                return "Baixo peso";
            } else if (imc >= 21.9 && imc < 27) {
                return "Peso normal";
            } else if (imc >= 27.1 && imc < 32) {
                return "Sobrepeso";
            } else if (imc >= 32.1 && imc < 37) {
                return "Obesidade grau I";
            } else if (imc >= 37.1 && imc < 41.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            return "Sexo inválido.";
        }
    }
}