<?php
    require_once('Ambiente.php');

    
    if ($_SERVER['REQUEST_METHOD'] == 'GET') {
        $Ambientes = SelectAmbiente();
        echo $Ambientes;
    }
    
?>
