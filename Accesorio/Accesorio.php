<?php
    require_once('database.php');

    function SelectAccesorio($IDComputadora){
        global $mysql;

        $query = "SELECT * FROM Accesorio WHERE IDComputadora = $IDComputadora";
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
    
    function InsertAccesorio($IDComputadora, $Tipo, $Descripcion, $Estado){
        global $mysql;

        $query = "INSERT INTO Accesorio (IDComputadora, Tipo, Descripcion, Estado) VALUES ($IDComputadora, $Tipo, '$Descripcion', $Estado)";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han ingresado los valores";
        }else{
            echo "Hubo un fallo al ingresar los valores";
        }
    }
    function UpdateAccesorio($IDAccesorio, $Estado){
        global $mysql;

        $query = "UPDATE Accesorio SET Estado = '$Estado' WHERE IDAccesorio = $IDAccesorio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han actualizado los valores";
        }else{
            echo "Hubo un fallo al actualizar los valores";
        }
    }
    function DeleteAccesorio($IDAccesorio){
        global $mysql;

        $query = "DELETE FROM Accesorio WHERE IDAccesorio = $IDAccesorio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se ha eliminado el Accesorio";
        }else{
            echo "Hubo un fallo al eliminar la Accesorio";
        };
    }
?>