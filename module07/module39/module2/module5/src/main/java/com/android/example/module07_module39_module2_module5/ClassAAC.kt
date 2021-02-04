package com.android.example.module07_module39_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module15_module39_module1.ClassAAE = com.android.example.module15_module39_module1.ClassAAE()
		local_var_2_1.method0(com.android.example.module15_module21_module1.ClassAAD(), com.android.example.module15_module21_module1.ClassAAE())

		val local_var_2_2: com.android.example.module15_module39_module1.ClassAAC = com.android.example.module15_module39_module1.ClassAAC()
		local_var_2_2.method1(com.android.example.module15_module21_module1.ClassAAF(), com.android.example.module15_module21_module1.ClassAAI(), com.android.example.module15_module21_module1.ClassAAI(), com.android.example.module15_module21_module1.ClassAAF())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module15_module39_module1.ClassAAE = com.android.example.module15_module39_module1.ClassAAE()
		local_var_2_1.method0(com.android.example.module15_module21_module1.ClassAAD(), com.android.example.module15_module21_module1.ClassAAE())

	}

	fun method2(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		param0.dispose()

		val local_var_2_2: com.android.example.module06_module173_module1.ClassAAH = com.android.example.module06_module173_module1.ClassAAH()
		local_var_2_2.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.dispose()

	}
}
