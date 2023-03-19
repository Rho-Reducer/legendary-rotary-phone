import React, {Component} from 'react'
import ReactDOM from 'react-dom'
const client = require('./client')
import ArticleList from './articleList'

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {articles: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/articles'}).done(response => {
			this.setState({articles: response.entity});
		});
	}

	render() { 
		return (
			<ArticleList articles={this.state.articles}/>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)