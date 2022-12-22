$(document).ready(
    function () {

        $("#inputDepartmentSelector").on('change', function (event) {
            event.preventDefault();
            ajaxPost();
        });

        function ajaxPost() {

            let createUserForm = {selected: $("#inputDepartmentSelector").val()};

            // DO POST
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "selectBranch",
                data: JSON.stringify(createUserForm),
                dataType: 'json',
                success: function (result) {
                    if (result.status === "success") {

                        $("#postResultDept").html(
                            result.data
                            + " POST Successfully! <br>"
                            + "---> Congrats !!" + "</p>");

                        $('#optionResultDept .inputBranch').empty();

                        $.each(result.data, function (index, item) {
                            let option = document.createElement('option');

                            option.innerHTML = item;
                            option.value = index;

                            $('#optionResultDept .inputBranch').append(option);

                        });

                        console.log("Success: ", result);

                    } else {
                        $("#postResultDept").html("<strong>Error</strong>");
                    }
                    console.log(result);
                },
                error: function (e) {
                    alert("Error!")
                    console.log("ERROR: ", e);
                }
            });

        }

    })