<?php
    require_once('database.php');

    function SelectAccesorio($IDAmbiente){
        global $mysql;

        $query = "SELECT a.* from Accesorio a INNER JOIN Ambiente b INNER JOIN Computadora c ON a.IDComputadora=c.IDComputadora  WHERE b.IDAmbiente = $IDAmbiente";
        $result = $mysql->query($query);
        
        if (!$result) {
        
        return "Error en la consulta SQL: " . mysqli_error($mysql);
        }
        
        if ($result->num_rows > 0) {
            $array = array();
            while ($row = $result->fetch_assoc()) {
                $array[] = $row;
            }
            return json_encode($array);
        } else {
            return "Problemas";
        }
    }
    
    function InsertAccesorio($IDComputadora, $Tipo, $Descripcion, $Estado){
        global $mysql;

        $query = "INSERT INTO Accesorio (IDComputadora, Tipo, Descripcion, Estado) VALUES ($IDComputadora, $Tipo, '$Descripcion', $Estado)";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han ingresado los valores";
        }else{
            echo "Hubo un fallo al ingresar los valores" . mysqli_error($mysql);
        }
    }
    function UpdateAccesorio($IDAccesorio, $Estado){
        global $mysql;

        $query = "UPDATE Accesorio SET Estado = '$Estado' WHERE IDAccesorio = $IDAccesorio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se han actualizado los valores";
        }else{
            echo "Hubo un fallo al actualizar los valores" . mysqli_error($mysql);
        }
    }
    function DeleteAccesorio($IDAccesorio){
        global $mysql;

        $query = "UPDATE Accesorio SET Estado = 0 WHERE IDAccesorio = $IDAccesorio";
        $result = $mysql->query($query);

        if( $mysql->affected_rows > 0){
            echo "Se ha eliminado el Accesorio";
        }else{
        echo "Hubo un fallo al eliminar la Accesorio" . mysqli_error($mysql);
        }
    }
?>