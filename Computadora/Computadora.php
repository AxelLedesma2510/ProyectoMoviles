<?php
    require_once('database.php');

    function SelectComputadoras(){
        global $mysql;

        $query = 'SELECT * FROM Computadora';
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
    function SelectComputadorasXAmbiente($IDAmbiente){
        global $mysql;

        $query = "SELECT * FROM Computadora WHERE IDAmbiente = $IDAmbiente";
        $result = $mysql->query($query);

        if ($result->num_rows > 0) {
            $array = array();
            while ($row = $result->fetch_assoc()) {
                $array[] = $row;
            }
            return json_encode($array);
        } else {
            return "No hay una computadora en el ambiente $IDAmbiente";
        }
    }
    function InsertComputadora($IDAmbiente, $Modelo, $Estado, $Fecha){
        global $mysql;

        $query = "INSERT INTO Computadora (IDAmbiente, Modelo, Estado, FechaObtencion) VALUES ($IDAmbiente,'$Modelo', $Estado, '$Fecha')";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han ingresado los valores";
        }else{
            echo "Hubo un fallo al ingresar los valores";
        }
    }
    function UpdateComputadora($IDComputadora, $IDAmbiente, $Modelo, $Estado, $Fecha){
        global $mysql;

        $query = "UPDATE Computadora SET IDAmbiente = $IDAmbiente, Modelo = '$Modelo', Estado = $Estado, FechaObtencion ='$Fecha' WHERE IDComputadora = $IDComputadora";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han actualizado los valores";
        }else{
            echo "Hubo un fallo al actualizar los valores";
        }
    }
    function DeleteComputadora($IDComputadora){
        global $mysql;

        $query = "DELETE FROM Computadora WHERE IDComputadora = $IDComputadora";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se ha eliminado la computadora";
        }else{
            echo "Hubo un fallo al eliminar la computadora";
        };
    }
?>