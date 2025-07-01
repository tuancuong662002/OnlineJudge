import axios from './axios' 

export async function problemSolver(payload) {
    try {
        const response = await axios.post('/submit', payload )
        console.log('Code submitted successfully:', response.data)
    }
    catch(error) {
        console.error('Error submitting code:', error)
        throw error
    }

}