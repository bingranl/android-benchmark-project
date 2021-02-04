package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAJ = com.android.example.module06_module147_module4_module6.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module147_module4_module6.ClassAAF = com.android.example.module06_module147_module4_module6.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module147_module4_module6.ClassAAF = com.android.example.module06_module147_module4_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAF,
		param2: com.android.example.module06_module147_module4_module6.ClassAAE
	) {
		listOf("1", "2", "3").forEach {
			param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		}
		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

			local_var_3_0.onComplete()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAG,
		param2: com.android.example.module06_module147_module4_module6.ClassAAI,
		param3: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.internal.queue.SpscLinkedArrayQueue<kotlin.Any> = io.reactivex.internal.queue.SpscLinkedArrayQueue(1)
		local_var_2_5.size()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onNext(kotlin.Any())

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param1: com.android.example.module06_module147_module4_module6.ClassAAH,
		param2: com.android.example.module06_module147_module4_module6.ClassAAB,
		param3: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		val local_var_2_5: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(61)
		local_var_2_5.add(kotlin.Any())

		param0.method1(io.reactivex.internal.util.AppendOnlyLinkedArrayList(95), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAD,
		param1: com.android.example.module06_module147_module4_module6.ClassAAH,
		param2: com.android.example.module06_module147_module4_module6.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}
}
