<?php
    require_once('Colegio.php');
    
    if ($_SERVER['REQUEST_METHOD'] == 'GET') {
        $Colegios = SelectColegio();
        echo $Colegios;
    }
    
    
?>
