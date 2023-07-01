<?php
    require_once('database.php');

    function SelectColegio(){
        global $mysql;

        $query = 'SELECT * FROM Colegio';
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
    
    function InsertColegio($Nombre){
        global $mysql;

        $query = "INSERT INTO Colegio (Nombre) VALUES ('$Nombre')";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han ingresado los valores";
        }else{
            echo "Hubo un fallo al ingresar los valores";
        }
    }
    function UpdateColegio($IDColegio, $Nombre){
        global $mysql;

        $query = "UPDATE Colegio SET Nombre = '$Nombre' WHERE IDColegio = $IDColegio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han actualizado los valores";
        }else{
            echo "Hubo un fallo al actualizar los valores";
        }
    }
    function DeleteColegio($IDColegio){
        global $mysql;

        $query = "DELETE FROM Colegio WHERE IDColegio = $IDColegio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se ha eliminado el Colegio";
        }else{
            echo "Hubo un fallo al eliminar la Colegio";
        };
    }
?>