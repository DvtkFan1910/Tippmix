$(document).ready(function () {
    $("#table_head").replaceWith('<table class="table table-striped table-dark"><tbody id="table_body">');
    var tr;
    var sportName = [];
    $.ajax({
        url: "/tippmix/events",
        success: function (data) {
            data.forEach(function (element) {

                if (sportName[element.sportId] === 'undefined'){
                    $('#sportEvent').append("<option value="+element.sportId+">"+element.sportName+"</option>");
                    sportName.push(element.sportId);
                }

                //console.log(element);
                tr = $('<tr/>');
                tr.append("<td>" + element.competitionGroupName + "</td>");
                tr.append("<td>" + element.competitionId + "</td>");
                tr.append("<td>" + element.competitionName + "</td>");
                tr.append("<td>" + element.eventDate + "</td>");
                tr.append("<td>" + element.eventName + "</td>");
                tr.append("<td>" + element.sportId + "</td>");
                tr.append("<td>" + element.sportName + "</td>");

                $('#table_body').append(tr);

            });
        }
    });
    $("#table_footer").replaceWith('</tbody></table>');

});