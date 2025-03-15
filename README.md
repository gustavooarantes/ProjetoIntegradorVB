<h2>Visão geral da aplicaação</h2>
<p>
+--------------------------------------+ </br>
|          Aplicacao (main)            | </br>
+--------------------------------------+ </br>
                | </br>
                v </br>
+--------------------------------------+ </br>
|       SimuladorSensores              | </br>
| - gerarDados(): DadosSensor          | </br>
+--------------------------------------+ </br>
                | </br>
                v </br>
+--------------------------------------+ </br>
|          DadosSensor                 | </br>
| - temperatura: double                | </br>
| - umidade: double                    | </br>
| - luminosidade: double               | </br> 
| + getTemperatura(): double           | </br>
| + getUmidade(): double               | </br>
| + getLuminosidade(): double          | </br>
+--------------------------------------+ </br>
                | </br>
                v </br>
+--------------------------------------+ </br>
|         ProcessadorDados             | </br>
| - processar(DadosSensor)             | </br>
+--------------------------------------+ </br>
</p>
