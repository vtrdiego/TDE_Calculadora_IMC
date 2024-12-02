package tests;
import controler.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    @Before
    public void setup() {
        calculadoraImc = new CalculadoraImc();
    }

    //TESTES ADULTOS

    @Test
    public void testBaixoPesoMuitoGrave() {
        String resultado = calculadoraImc.calcularImc(48.0, 1.735, 20, "masculino");
        Assert.assertEquals("Baixo peso muito grave", resultado);
    }

    @Test
    public void testBaixoPesoGraveMinimo() {
        String resultado = calculadoraImc.calcularImc(48.0, 1.73, 20, "feminino");
        Assert.assertEquals("Baixo peso grave", resultado);
    }

    @Test
    public void testBaixoPesoGraveMaximo() {
        String resultado = calculadoraImc.calcularImc(50.0, 1.72, 65, "masculino");
        Assert.assertEquals("Baixo peso grave", resultado);
    }

    @Test
    public void testBaixoPesoMinimo() {
        String resultado = calculadoraImc.calcularImc(50, 1.71, 40, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    @Test
    public void testBaixoPesoMaximo() {
        String resultado = calculadoraImc.calcularImc(55, 1.73, 28, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    @Test
    public void testPesoNormalMinimo() {
        String resultado = calculadoraImc.calcularImc(59, 1.75, 22, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testPesoNormalMaximo() {
        String resultado = calculadoraImc.calcularImc(75, 1.75, 30, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testSobrepesoMinimo() {
        String resultado = calculadoraImc.calcularImc(76, 1.74, 40, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testSobrepesoMaximo() {
        String resultado = calculadoraImc.calcularImc(91, 1.75, 50, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testObesidadeGrauIMinimo() {
        String resultado = calculadoraImc.calcularImc(92, 1.75, 55, "feminino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIMaximo() {
        String resultado = calculadoraImc.calcularImc(107, 1.75, 60, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIIMinimo() {
        String resultado = calculadoraImc.calcularImc(108, 1.75, 25, "feminino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIIMaximo() {
        String resultado = calculadoraImc.calcularImc(122, 1.75, 30, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIII() {
        String resultado = calculadoraImc.calcularImc(130, 1.75, 35, "feminino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    //TESTES IDOSOS FEMININOS

    @Test
    public void testBaixoPeso() {
        String resultado = calculadoraImc.calcularImc(50, 1.60, 70, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    @Test
    public void testPesoNormalMinimoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(57, 1.60, 70, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testPesoNormalMaximoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(69.12, 1.60, 70, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testSobrepesoMinimoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(69.60, 1.60, 70, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testSobrepesoMaximoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(81.92, 1.60, 70, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testObesidadeGrauIMinimoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(82.40, 1.60, 70, "feminino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIMaximoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(94.72, 1.60, 70, "feminino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIIMinimoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(95.20, 1.60, 70, "feminino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIIMaximoIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(106, 1.60, 70, "feminino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIIIdosoFeminino() {
        String resultado = calculadoraImc.calcularImc(110, 1.60, 70, "feminino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    //TESTES IDOSOS MASCULINOS

    @Test
    public void testBaixoPesoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(60, 1.70, 70, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    @Test
    public void testPesoNormalMinimoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(63.6, 1.70, 70, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testPesoNormalMaximoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(76, 1.70, 70, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    @Test
    public void testSobrepesoMinimoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(78.6, 1.70, 70, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testSobrepesoMaximoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(86, 1.70, 70, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testObesidadeGrauIMinimoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(85, 1.68, 70, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIMaximoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(101.1, 1.70, 70, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    @Test
    public void testObesidadeGrauIIMinimoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(102, 1.70, 70, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIIMaximoIdosoMasculino() {
        String resultado = calculadoraImc.calcularImc(115.2, 1.70, 70, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    @Test
    public void testObesidadeGrauIIIMorbidHomemIdoso() {
        String resultado = calculadoraImc.calcularImc(120, 1.70, 70, "masculino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    //TESTES INFANTIL MASCULINO:
    @Test
    public void testImcBaixoPeso2Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(10.0, 0.85, 2, "masculino"));
    }

    @Test
    public void testImcPesoNormal2Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(12.5, 0.9, 2, "masculino"));
    }

    @Test
    public void testImcSobrepeso2Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(15.0, 0.9, 2, "masculino"));
    }

    @Test
    public void testImcObesidade2Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(20.0, 0.9, 2, "masculino"));
    }

    @Test
    public void testImcBaixoPeso4Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(15.0, 1.05, 4, "masculino"));
    }

    @Test
    public void testImcPesoNormal4Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(18.0, 1.1, 4, "masculino"));
    }

    @Test
    public void testImcSobrepeso4Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(22.0, 1.11, 4, "masculino"));
    }

    @Test
    public void testImcObesidade4Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(23.0, 1.1, 4, "masculino"));
    }

    @Test
    public void testImcBaixoPeso6Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(18.0, 1.15, 6, "masculino"));
    }

    @Test
    public void testImcPesoNormal6Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(22.0, 1.25, 6, "masculino"));
    }

    @Test
    public void testImcSobrepeso6Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(27.0, 1.23, 6, "masculino"));
    }

    @Test
    public void testImcObesidade6Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(30.0, 1.25, 6, "masculino"));
    }

    @Test
    public void testImcBaixoPeso8Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(22.0, 1.3, 8, "masculino"));
    }

    @Test
    public void testImcPesoNormal8Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(28.0, 1.4, 8, "masculino"));
    }

    @Test
    public void testImcSobrepeso8Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(38.0, 1.4, 8, "masculino"));
    }

    @Test
    public void testImcObesidade8Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(39.0, 1.4, 8, "masculino"));
    }

    @Test
    public void testImcBaixoPeso10Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(27.0, 1.4, 10, "masculino"));
    }

    @Test
    public void testImcPesoNormal10Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(33.0, 1.5, 10, "masculino"));
    }

    @Test
    public void testImcSobrepeso10Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(40.0, 1.4, 10, "masculino"));
    }

    @Test
    public void testImcObesidade10Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(49.0, 1.5, 10, "masculino"));
    }

    @Test
    public void testImcBaixoPeso12Anos() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(38.0, 1.58, 12, "masculino"));
    }

    @Test
    public void testImcPesoNormal12Anos() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(50.0, 1.65, 12, "masculino"));
    }

    @Test
    public void testImcSobrepeso12Anos() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(60.0, 1.65, 12, "masculino"));
    }

    @Test
    public void testImcObesidade12Anos() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(70.0, 1.65, 12, "masculino"));
    }

    //TESTES INFANTIL FEMININO
    @Test
    public void testeBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(10, 1.0, 2, "feminino"));//10

    }
    @Test
    public void testePesoNormal2() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(15, 1.0, 2, "feminino"));//15

    }

    @Test
    public void testeSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(19, 1.0, 2, "feminino"));//19

    }

    @Test
    public void testeObesidade2() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(20, 1.0, 2, "feminino"));//20

    }


    @Test
    public void testeBaixoPeso4() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(12, 1.1, 4, "feminino"));//9,92

    }

    @Test
    public void testePesoNormal4() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(19, 1.1, 4, "feminino"));//15,70

    }

    @Test
    public void testeSobrepeso4() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(22, 1.1, 4, "feminino"));//19,83

    }

    @Test
    public void testeObesidade4() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(26, 1.1, 4, "feminino"));//19,83

    }

    @Test
    public void testeBaixoPeso6() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(14, 1.2, 6, "feminino"));//9,72

    }

    @Test
    public void testePesoNormal6() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(24, 1.2, 6, "feminino"));//16,67

    }

    @Test
    public void testeSobrepeso6() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(26, 1.2, 6, "feminino"));//18,06

    }

    @Test
    public void testeObesidade6() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(30, 1.2, 6, "feminino"));//20,83

    }

    @Test
    public void testeBaixoPeso8() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(16, 1.3, 8, "feminino"));//9,47

    }

    @Test
    public void testePesoNormal8() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(26, 1.3, 8, "feminino"));//15,38

    }

    @Test
    public void testeSobrepeso8() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(33, 1.3, 8, "feminino"));//18,93

    }

    @Test
    public void testeObesidade8() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(40, 1.3, 8, "feminino"));//23,67

    }

    @Test
    public void testeBaixoPeso10() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(18, 1.4, 10, "feminino"));//9,18

    }

    @Test
    public void testePesoNormal10() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(30, 1.4, 10, "feminino"));//15,31

    }

    @Test
    public void testeSobrepeso10() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(41, 1.4, 10, "feminino"));//18,88

    }

    @Test
    public void testeObesidade10() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(50, 1.4, 10, "feminino"));//25,51

    }

    @Test
    public void testeBaixoPeso12() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(20, 1.5, 12, "feminino"));//8,89

    }

    @Test
    public void testePesoNormal12() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(40, 1.5, 12, "feminino"));//15,56

    }

    @Test
    public void testeSobrepeso12() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(49, 1.5, 12, "feminino"));//19,11

    }

    @Test
    public void testeObesidade12() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(60, 1.5, 12, "feminino"));//26,67

    }
}


