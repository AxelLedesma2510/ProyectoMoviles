<?php
    require_once('Ambiente.php');

    
    if ($_SERVER['REQUEST_METHOD'] == 'GET') {
        $Ambientes = SelectAmbiente();
        echo $Ambientes;
    }
    
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        
        $IDAmbiente = $_POST['IDAmbiente'];
        
        $select = SelectAmbienteXColegio($IDAmbiente);
        echo $select;
    }
?>
