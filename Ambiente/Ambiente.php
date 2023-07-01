<?php
    require_once('database.php');

    function SelectAmbiente(){
        global $mysql;

        $query = 'SELECT * FROM Ambiente';
        $result = $mysql->query($query);

        if ($result->num_rows > 0) {
            $array = array();
            while ($row = $result->fetch_assoc()) {
                $array[] = $row;
            }
            return json_encode($array);
        } else {
            return "Problems";
        }
    }
    
    function SelectAmbienteXColegio($IDColegio){
        global $mysql;

        $query = "SELECT * FROM Ambiente WHERE IDColegio = $IDColegio";
        $result = $mysql->query($query);

        if ($result->num_rows > 0) {
            $array = array();
            while ($row = $result->fetch_assoc()) {
                $array[] = $row;
            }
            return json_encode($array);
        } else {
            return "No hay Ambientes en el colegio: $IDColegio";
        }
    }
    function InsertAmbiente($IDColegio, $Descripcion){
        global $mysql;

        $query = "INSERT INTO Ambiente (IDColegio, Descripcion) VALUES ($IDColegio,'$Descripcion')";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han ingresado los valores";
        }else{
            echo "Hubo un fallo al ingresar los valores";
        }
    }
    function UpdateAmbiente($IDAmbiente, $IDColegio, $Descripcion){
        global $mysql;

        $query = "UPDATE Ambiente SET IDColegio = $IDColegio, Descripcion = '$Descripcion' WHERE IDAmbiente = $IDAmbiente";
        $result = $mysql->query($query);
        
        if( $mysql->affected_rows > 0){
            echo "Se han actualizado los valores" ;
        }else{
            echo "Hubo un fallo al actualizar los valores ";
        }
    }
    function DeleteAmbiente($IDAmbiente){
        global $mysql;

        $query = "DELETE FROM Ambiente WHERE IDAmbiente = $IDAmbiente";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se ha eliminado la Ambiente";
        }else{
            echo "Hubo un fallo al eliminar la Ambiente";
        };
    }
?>