document.addEventListener('DOMContentLoaded', function () {
  const form = document.querySelector('form')
  const Iname = document.querySelector('.name')
  const IdateOfBirth = document.querySelector('.dateOfBirth')
  const Igender = document.querySelectorAll('.gender')
  const Istreet = document.querySelector('.street')
  const Idistrict = document.querySelector('.district')
  const Inumber = document.querySelector('.number')
  const Iemail = document.querySelector('.email')
  const Iheight = document.querySelector('.height')
  const Iweight = document.querySelector('.weight')
  const IfitnessGoals = document.querySelector('.fitnessGoals')
  const ImedicalHistory = document.querySelector('.medicalHistory')

  function formatDate(date) {
    const day = date.getDate().toString().padStart(2, '0') // Obtém o dia e adiciona zero à esquerda se for menor que 10.
    const month = (date.getMonth() + 1).toString().padStart(2, '0') // Obtém o mês (0-11) e adiciona 1 para obter o mês real.
    const year = date.getFullYear()

    return `${day}-${month}-${year}`
  }

  function register(selectedGender) {
    const dateOfBirth = new Date(IdateOfBirth.value);
    const formattedDateOfBirth = formatDate(dateOfBirth);

    const registrationDate = new Date();
    const formattedRegistrationDate = formatDate(registrationDate);

    const height = parseFloat(Iheight.value.replace(',', '.'));
    const weight = parseFloat(Iweight.value.replace(',', '.'));

    fetch('http://localhost:8080/cadastro', {
      headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json'
      },
      method: 'POST',
      body: JSON.stringify({
        name: Iname.value,
        dateOfBirth: formattedDateOfBirth,
        gender: selectedGender,
        street: Istreet.value,
        district: Idistrict.value,
        number: Inumber.value,
        email: Iemail.value,
        height: height,
        weight: weight,
        fitnessGoals: IfitnessGoals.value,
        medicalHistory: ImedicalHistory.value,
        registrationDate: formattedRegistrationDate

      })
    })
      .then(function (res) {
        console.log(res)
      })
      .catch(function (res) {
        console.log(res)
      })
  }

  function clean() {
    Iname.value = ''
    IdateOfBirth.value = ''
    selectedGender = ''
    Istreet.value = ''
    Idistrict.value = ''
    Inumber.value = ''
    Iemail.value = ''
    Iheight.value = ''
    Iweight.value = ''
    IfitnessGoals.value = ''
    ImedicalHistory.value = ''
  }

  form.addEventListener('submit', function (event) {
    event.preventDefault()

    let selectedGender = null

    Igender.forEach(function (radioButton) {
      if (radioButton.checked) {
        selectedGender = radioButton.value
      }
    })

    register(selectedGender)
    clean()
  })
})
