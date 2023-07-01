<?php
    require_once('Accesorio.php');

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
                
        $IDComputadora = $_POST['IDComputadora'];
        $Tipo = $_POST['Tipo'];
        $Descripcion = $_POST['Descripcion'];
        $Estado = $_POST['Estado'];
        if($Estado == NULL){
            $Estado = 1;
        }
        $Insertar = InsertAccesorio($IDComputadora, $Tipo, $Descripcion, $Estado);
        echo $Insertar;
    }
?>