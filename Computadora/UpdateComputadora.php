<?php
    require_once('Computadora.php');

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDComputadora = $_POST['IDComputadora'];
        $IDAmbiente = $_POST['IDAmbiente'];
        $Modelo = $_POST['Modelo'];
        $Estado = $_POST['Estado'];
        $Fecha = $_POST['Fecha'];
        
        $Update = UpdateComputadora($IDComputadora,$IDAmbiente,$Modelo,$Estado,$Fecha);
        echo $Update;
    }
?>