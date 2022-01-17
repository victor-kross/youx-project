var app = new Vue({ 
      el: '#app',
      data: {
            form: {
                  nome: '',
                  sobrenome: '',
                  cpf: '',
                  email: '',
                  nascimento: '',
                  peso: '',
                  altura: '',
                  medicamento: null,
                  areaSaude: null,
                  regiao: null,
                  descricao: ''
            }
      },
      methods: {
            enviar () {
                  const axios = require('axios');

                  const instance = axios.create({
                        baseURL: 'localhost:8080'
                      });

                  axios.post('/formulario', this.form)
            }
      }
  });