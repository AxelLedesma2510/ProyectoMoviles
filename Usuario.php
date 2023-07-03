<?php
    require_once('database.php');
    function SelectUsuario($User, $Password){
        global $mysql;
        
        $query = "SELECT IDColegio FROM Usuario WHERE User = '$User' AND Password = '$Password' ";
        $result = $mysql->query($query);

        if ($result->num_rows > 0) {
            $array = array();
            while ($row = $result->fetch_assoc()) {
                $array[] = $row;
            }
            return json_encode($array);
        } else {
            return "Problems" .$mysql->error;
        }
    }