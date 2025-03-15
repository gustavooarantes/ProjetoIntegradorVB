<h2>Visão geral da aplicaação</h2>
<p>
+--------------------------------------+
|          Aplicacao (main)            |
+--------------------------------------+
                |
                v
+--------------------------------------+
|       SimuladorSensores              |
| - gerarDados(): DadosSensor          |
+--------------------------------------+
                |
                v
+--------------------------------------+
|          DadosSensor                 |
| - temperatura: double                |
| - umidade: double                    |
| - luminosidade: double               |
| + getTemperatura(): double           |
| + getUmidade(): double               |
| + getLuminosidade(): double          |
+--------------------------------------+
                |
                v
+--------------------------------------+
|         ProcessadorDados             |
| - processar(DadosSensor)             |
+--------------------------------------+
</p>
